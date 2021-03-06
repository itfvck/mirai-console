package net.mamoe.mirai.console.command

public abstract class RawCommand(
    public override val owner: CommandOwner,
    public override vararg val names: String,
    public override val usage: String = "<no usages given>",
    public override val description: String = "<no descriptions given>",
    public override val permission: CommandPermission = CommandPermission.Default,
    public override val prefixOptional: Boolean = false
) : Command {
    public abstract override suspend fun CommandSender.onCommand(args: Array<out Any>)
}
